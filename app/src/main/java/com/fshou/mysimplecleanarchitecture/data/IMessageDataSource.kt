package com.fshou.mysimplecleanarchitecture.data

import com.fshou.mysimplecleanarchitecture.domain.MessageEntity

interface IMessageDataSource {
    fun getMessageFromSource(name: String): MessageEntity
}