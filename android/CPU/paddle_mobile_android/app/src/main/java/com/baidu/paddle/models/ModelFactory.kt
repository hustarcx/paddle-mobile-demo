package com.baidu.paddle.models

/**
 * 根据类型创建不同的Model实现.
 */
object ModelFactory {
    fun buildModel(type: ModelType): Model = when (type) {
        ModelType.mobilenet -> MobileNetModelImpl()
        else -> {
            throw IllegalAccessException("load unregisted model")
        }
    }
}