const card = require('./schemas/cardV1');
const {readFileSync, promises: fsPromises} = require('fs')

function syncReadFile(filename) {
    const contents = readFileSync(filename, 'utf-8');
    return JSON.parse(contents);
}

let json = syncReadFile('../schemas.json');
let cases = json['data'];

let hasContractsNotDefined = false;
let hasContractsWithError = false;

for (let i = 0; i < cases.length; i++) {
    let mockCase = cases[i];
    try {
        const testCase = require('./schemas/'+mockCase['key']);
        const { error } = testCase(mockCase['object']);

        if (error != null){
            console.log("[FAIL] Schema test fail '" + mockCase['key'] + "' ⤵ :");
            console.log(error);
            hasContractsWithError = true;
        } else {
            console.log("[SUCCESS] Schema test ok! '" + mockCase['key'] + "'");
        }

    } catch (e) {
        hasContractsNotDefined = true;
        if (e.code === 'MODULE_NOT_FOUND') {
            console.log("[ERROR] Schema test not defined for '" + mockCase['key'] + "'")
        }
    }
}

if (hasContractsWithError){
    throw new Error("One or more schemas have a validation error");
}

if (hasContractsNotDefined){
    throw new Error("Some Schemas annotated with '@SchemaTestsScan' were not found in the 'schemas' directory");
}
