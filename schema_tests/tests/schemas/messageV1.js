const Joi = require("joi");

module.exports = function (payload) {
    const schema = Joi.object().keys({
        fee: Joi.number(),
    }).required();

    return schema.validate(payload);
};