const Joi = require("joi");

module.exports = function (payload) {
    const schema = Joi.object().keys({
        fee: Joi.string(),
    }).required();

    return schema.validate(payload);
};