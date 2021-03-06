/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */
package org.esigate.util;

import java.util.Properties;

/**
 * Long parameter.
 * 
 * @author Alexis Thaveau
 */
public class ParameterLong extends Parameter<Long> {

    public ParameterLong(String name, Long defaultValue) {
        super(name, defaultValue);
    }

    public ParameterLong(String name) {
        super(name);
    }

    @Override
    public Long getValue(Properties properties) {
        Long defaultValue = 0L;
        if (getDefaultValue() != null) {
            defaultValue = getDefaultValue();
        }
        Long value = PropertiesUtil.getPropertyValue(properties, getName(), defaultValue);
        return value;

    }
}
