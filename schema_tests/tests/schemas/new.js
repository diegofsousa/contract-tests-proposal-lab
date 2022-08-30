module.exports = function (joi, payload) {
    const schema = joi.object().keys({
        age: joi.number(),
    }).required();

    return schema.validate(payload);
};