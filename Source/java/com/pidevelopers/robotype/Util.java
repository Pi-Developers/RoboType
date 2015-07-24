/*
 * Copyright (C) 2015 Mohammed Rashad
 * Copyright (C) 2015 Sahid S Almas
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
package com.pidevelopers.robotype;


public class Util {
    /**
     * <p>In this method we will hook String.class to used in</p>
     * <p>refection</p>
     * @return Hooked String.class
     */
    public static Class getHookStringClass() {
        Class[] classes = new Class[1];
        return classes[0] = String.class;
    }

    /**
     * <p>In this method it will make constant value to zero</p>
     */
    public static void flushConstantAll() {
        Constants.GET_WRITING_SPEED = 0;
        Constants.CONTENTS_OF_THE_ROBO_TEXT = null;
        Constants.FROM_WHERE_START_TO_WRITE = 0;
        Constants.GET_REFLECTION_METHOD = null;
        Constants.GET_REFLECTION_OBJECT = null;
        Constants.ROBO_TYPE_HANDLER = null;
    }
    public static String[] cutIntoSmallPiece(String a) {
        return a.split("");
    }
}