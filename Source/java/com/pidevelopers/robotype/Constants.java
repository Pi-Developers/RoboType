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

import android.os.Handler;

import java.lang.reflect.Method;

public class Constants {
    /**
     * <p>This object required to invoke method in the RoboType class</p>
     * <p>In the main method we should initialize it because currently
     * it set to null</p>
     */
    public static  Object GET_REFLECTION_OBJECT = null;

    /**
     * <p>This method variable will be need in the RoboType class</p>
     * <p>Currently this variable will return null and must be</p>
     * <p>initialize </p>
     */
    public static  Method GET_REFLECTION_METHOD = null;

    /**
     * <p>In this variable all the character will be stored when we</p>
     * <p>split the text and set on it</p>
     */
    public static  String[] CONTENTS_OF_THE_ROBO_TEXT = null;

    /**
     * <p>This is the source of the reflection what will be perform in the</p>
     * <p>The robo class</p>
     */
    public static  Class<?> GET_REFLECTION_SOURCE = null;

    /**
     * <p>This is the variable where will stored the speed </p>
     */
    public static int GET_WRITING_SPEED = 0;

    /**
     * <p>This is the most important variable it will plus when one </p>
     * <p>text added to the contents</p>
     */
    public static  int FROM_WHERE_START_TO_WRITE = 0;

    /**
     * <p>In this variable we will start writing process</p>
     */
    public static  Handler ROBO_TYPE_HANDLER = null;
}