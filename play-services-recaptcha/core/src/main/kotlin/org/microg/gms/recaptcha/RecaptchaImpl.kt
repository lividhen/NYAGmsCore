/*
 * SPDX-FileCopyrightText: 2023 microG Project Team
 * SPDX-License-Identifier: Apache-2.0
 */

package org.microg.gms.recaptcha

import com.nyagoogle.android.gms.recaptcha.RecaptchaHandle
import com.nyagoogle.android.gms.recaptcha.RecaptchaResultData
import com.nyagoogle.android.gms.recaptcha.internal.ExecuteParams
import com.nyagoogle.android.gms.recaptcha.internal.InitParams

interface RecaptchaImpl {
    suspend fun init(params: InitParams): RecaptchaHandle
    suspend fun execute(params: ExecuteParams): RecaptchaResultData
    suspend fun close(handle: RecaptchaHandle): Boolean

    object Unsupported : RecaptchaImpl {
        override suspend fun init(params: InitParams): RecaptchaHandle {
            throw UnsupportedOperationException()
        }

        override suspend fun execute(params: ExecuteParams): RecaptchaResultData {
            throw UnsupportedOperationException()
        }

        override suspend fun close(handle: RecaptchaHandle): Boolean {
            throw UnsupportedOperationException()
        }
    }
}

