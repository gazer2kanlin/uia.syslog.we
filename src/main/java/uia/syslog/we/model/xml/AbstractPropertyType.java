/*******************************************************************************
 * Copyright 2017 UIA
 *
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements. See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *******************************************************************************/
package uia.syslog.we.model.xml;

import org.simpleframework.xml.Attribute;

/**
 *
 * @author Kyle K. Lin
 *
 */
public abstract class AbstractPropertyType {

    @Attribute
    protected String id;

    @Attribute(required = false)
    protected String translate;

    @Attribute(required = false)
    protected String assignStr;

    @Attribute(required = false)
    protected Boolean required;

    public AbstractPropertyType() {
        this.assignStr = ": ";
    }

    public String getId() {
        return this.id;
    }

    public void setId(String value) {
        this.id = value.trim();
    }

    public String getAssignStr() {
        return this.assignStr == null ? ": " : this.assignStr;
    }

    public void setAssignStr(String assignStr) {
        this.assignStr = assignStr;
    }

    public String getTranslate() {
        return this.translate == null || this.translate.trim().length() == 0 ? this.id : this.translate;
    }

    public void setTranslate(String value) {
        this.translate = value.trim();
    }

    public boolean isRequired() {
        if (this.required == null) {
            return true;
        }
        else {
            return this.required;
        }
    }

    public void setRequired(Boolean value) {
        this.required = value;
    }

}
