package com.icecreamqaq.yu.test.annotation

import com.IceCreamQAQ.Yu.annotation.LoadBy_
import com.IceCreamQAQ.Yu.controller.DefaultControllerLoaderImpl
import javax.inject.Named

@LoadBy_(DefaultControllerLoaderImpl::class)
@Named("priv")
annotation class CController