/*
 * Copyright (C) 2014 The Android Open Source Project
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

package com.jsdroid.uiautomator;

/**
 * A {@link StaleObjectException} exception is thrown when a {@link UiObject2} is used after the
 * underlying {@link android.view.View} has been destroyed. In this case, it is necessary to call
 * {@link UiDevice#findObject(BySelector)} to obtain a new {@link UiObject2} instance.
 */
public class StaleObjectException extends RuntimeException {
}
