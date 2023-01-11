/*
 * Copyright (C) 2014 The Android Open Source Project
 * Copyright (C) 2022 The Beach Institute
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.beachos.bellis

import android.app.admin.DeviceAdminReceiver
import android.content.ComponentName
import android.content.Context

class BasicDeviceAdminReceiver : DeviceAdminReceiver() {

    companion object {
        fun getComponentName(context: Context): ComponentName {
            return ComponentName(context, BasicDeviceAdminReceiver::class.java.name)
        }
    }
}
