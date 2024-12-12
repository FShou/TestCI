package com.fshou.mysimplecleanarchitecture.di

import com.fshou.mysimplecleanarchitecture.data.IMessageDataSource
import com.fshou.mysimplecleanarchitecture.data.MessageDataSource
import com.fshou.mysimplecleanarchitecture.data.MessageRepository
import com.fshou.mysimplecleanarchitecture.domain.IMessageRepository
import com.fshou.mysimplecleanarchitecture.domain.MessageInteractor
import com.fshou.mysimplecleanarchitecture.domain.MessageUseCase

object Injection {
    fun provideUseCase(): MessageUseCase {
        val messageRepository = provideRepository()
        return MessageInteractor(messageRepository)
    }

    private fun provideRepository(): IMessageRepository {
        val messageDataSource = provideDataSource()
        return MessageRepository(messageDataSource)
    }

    private fun provideDataSource(): IMessageDataSource {
        return MessageDataSource()
    }
}