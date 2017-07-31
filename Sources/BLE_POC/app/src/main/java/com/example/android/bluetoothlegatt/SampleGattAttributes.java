/*
 * Copyright (C) 2013 The Android Open Source Project
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

package com.example.android.bluetoothlegatt;

import java.util.HashMap;

/**
 * This class includes a small subset of standard GATT attributes for demonstration purposes.
 */
public class SampleGattAttributes {
    private static HashMap<String, String> attributes = new HashMap();
    public static String Main_SERVICE = "177885d6-941a-4915-9feb-9b23c2db874c";
    public static String WRITE_CHAR = "1778d6eb-941a-4915-9feb-9b23c2db874c";
    public static String Read = "17780594-941a-4915-9feb-9b23c2db874c";
    public static String DATA_CHARACTERSTICS = "17780594-941a-4915-9feb-9b23c2db874c";
    public static String DEVICE_SERVICE = "0x180F";

    static {
        // Sample Services.
        attributes.put("177885d6-941a-4915-9feb-9b23c2db874c", "Main Service");
        attributes.put("17780594-941a-4915-9feb-9b23c2db874c", "data characteristics");
        // Sample Characteristics.
        attributes.put(Main_SERVICE, "Main service");
        attributes.put(DEVICE_SERVICE, "DEVICE_SERVICE ");
        attributes.put("1778d6eb-941a-4915-9feb-9b23c2db874c", "write characteristic");

    }

    public static String lookup(String uuid, String defaultName)
    {
        String name = attributes.get(uuid.toLowerCase());
        return name == null ? defaultName : name;
    }
}