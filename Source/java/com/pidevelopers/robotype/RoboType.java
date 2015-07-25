/*
 * Copyright (C) 2015 Pi Developers
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
 *
 * @author mohammed rashad , sahid almas
 */
package com.pidevelopers.robotype;


import android.os.Handler;
import android.os.Message;

import java.lang.reflect.InvocationTargetException;

public class RoboType {
    /**
     * <p>This is the main method that will handle simulating text view</p>
     * <p>In your class you must assign method which name is Robo that must be </p>
     * <p>static and having parm String x where x will be append your textview  </p>
     * @param contents <p>Your text you can also use like getString </p>
     * @param className <p>include package name also example com.bla.Class</p>
     * @param speed <p>1 is the higest speed we recommended you to use 100</p>
     */
    public static void update(String contents, final String className,int speed) {
        
        Constants.CONTENTS_OF_THE_ROBO_TEXT = Util.cutIntoSmallPiece(contents);
        Constants.GET_WRITING_SPEED = speed;
        Constants.FROM_WHERE_START_TO_WRITE = 0;
        Constants.ROBO_TYPE_HANDLER = new Handler() {

            @Override
            public void handleMessage(Message msg) {
                super.handleMessage(msg);
                
                if (Constants.FROM_WHERE_START_TO_WRITE < Constants.CONTENTS_OF_THE_ROBO_TEXT.length) {
                    
                    Constants.FROM_WHERE_START_TO_WRITE++;
                    
                    if (Constants.FROM_WHERE_START_TO_WRITE >= Constants.CONTENTS_OF_THE_ROBO_TEXT.length ) {
                        Util.flushConstantAll();
                        
                        
                    } else {
                        
                        try {
                            
                            Constants.GET_REFLECTION_SOURCE = Class.forName(className);
                            Constants.GET_REFLECTION_OBJECT = Constants.GET_REFLECTION_SOURCE.newInstance();
                            Constants.GET_REFLECTION_METHOD= Constants.GET_REFLECTION_SOURCE.getDeclaredMethod("Robo", Util.getHookStringClass());
                            Constants.GET_REFLECTION_METHOD.invoke(Constants.GET_REFLECTION_OBJECT, Constants.CONTENTS_OF_THE_ROBO_TEXT[Constants.FROM_WHERE_START_TO_WRITE]);
                            
                        } catch (ClassNotFoundException e) {
                            e.printStackTrace();
                        } catch (NoSuchMethodException e) {
                            e.printStackTrace();
                        } catch (InvocationTargetException e) {
                            e.printStackTrace();
                        } catch (IllegalAccessException e) {
                            e.printStackTrace();
                        } catch (InstantiationException e) {
                            e.printStackTrace();
                        }
                    }
                }
                else {

                }
            }
        };

        new Thread(new Runnable() {
            public void run()
            {
                while (true)
                {
                    try
                    {

                        //sets the delay  before typing next letter
                        Thread.sleep(Constants.GET_WRITING_SPEED);
                        
                        Constants.ROBO_TYPE_HANDLER.sendEmptyMessage(0);

                    }
                    catch (InterruptedException e)
                    {

                        e . printStackTrace();
                        Util.flushConstantAll();

                    }
                }
            }
        }) . start();


    }
}
