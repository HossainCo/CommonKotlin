@file:Suppress("NOTHING_TO_INLINE")

package ir.hossainco.commonkotlin.provider

typealias SingleProvider<R, P> = (P) -> R

inline fun <R, P> SingleProvider<R, P>.provide(p: P) = this(p)

