const Joi = require("joi");

module.exports = function (payload) {
    const schema = Joi.object().keys({
        id: Joi.number(),
        name: Joi.string(),
        fee: Joi.number(),
        details: Joi.object().keys({
            type: Joi.string(),
            active: Joi.boolean(),
            days: Joi.number(),
        })
    }).required();

    return schema.validate(payload);
};