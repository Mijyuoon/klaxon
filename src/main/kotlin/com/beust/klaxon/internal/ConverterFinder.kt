package com.beust.klaxon.internal

import com.beust.klaxon.Converter
import kotlin.reflect.KProperty

interface ConverterFinder {
    fun findFromConverter(value: Any, prop: KProperty<*>?): Pair<Converter, Any>?
}
