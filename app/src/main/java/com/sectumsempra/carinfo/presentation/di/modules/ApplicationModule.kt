package com.sectumsempra.carinfo.presentation.di.modules

import com.sectumsempra.carinfo.BuildConfig
import org.koin.core.qualifier.named
import org.koin.dsl.module

enum class AppConstant {
    BASE_URL,
    DATABASE_PREFIX
}

internal val applicationIdentifiersDependencies = module {
    single(qualifier = named(AppConstant.BASE_URL)) { BuildConfig.API_URL }
    single(qualifier = named(AppConstant.DATABASE_PREFIX)) { BuildConfig.DATABASE_PREFIX }
}