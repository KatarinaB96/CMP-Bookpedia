package com.plcoding.bookpedia.core.presentation

import cmp_bookpedia.composeapp.generated.resources.Res
import cmp_bookpedia.composeapp.generated.resources.disk_full
import cmp_bookpedia.composeapp.generated.resources.error_no_internet
import cmp_bookpedia.composeapp.generated.resources.error_serialization
import cmp_bookpedia.composeapp.generated.resources.request_timeout
import cmp_bookpedia.composeapp.generated.resources.unknown_error
import com.plcoding.bookpedia.core.domain.DataError

fun DataError.toUiText(): UiText {
    val stringResource = when (this) {
        DataError.Local.DISK_FULL -> Res.string.disk_full
        DataError.Local.UNKNOWN -> Res.string.unknown_error
        DataError.Remote.REQUEST_TIMEOUT -> Res.string.request_timeout
        DataError.Remote.TOO_MANY_REQUESTS -> Res.string.request_timeout
        DataError.Remote.NO_INTERNET -> Res.string.error_no_internet
        DataError.Remote.SERVER -> Res.string.unknown_error
        DataError.Remote.SERIALIZATION -> Res.string.error_serialization
        DataError.Remote.UNKNOWN -> Res.string.unknown_error
    }
    return UiText.StringResourceId(stringResource)
}