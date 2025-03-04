package com.mukul.jan.primer.data.login.api.hilt

import com.mukul.jan.primer.data.login.api.AuthApi
import com.mukul.jan.primer.data.login.api.AuthApiImpl
import com.mukul.jan.primer.data.login.api.RealmAppApi
import com.mukul.jan.primer.data.login.api.RealmAppApiImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class HiltModule {

    @Singleton
    @Binds
    abstract fun bindRealmAppApi(
        impl: RealmAppApiImpl
    ): RealmAppApi


    @Singleton
    @Binds
    abstract fun bindLoginApi(
        impl: AuthApiImpl
    ): AuthApi

}