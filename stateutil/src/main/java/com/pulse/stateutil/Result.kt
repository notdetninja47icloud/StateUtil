package com.pulse.stateutil

sealed class Result<out T> {
    data class Success<out T >(val data: T) : Result<T>()
    data class Failure(val exception: Throwable) : Result<Nothing>()
    data class Loading(val state: Boolean) : Result<Nothing>()
}