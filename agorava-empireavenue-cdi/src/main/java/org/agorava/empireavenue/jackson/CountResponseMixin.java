/*
 * Copyright 2014 Agorava.
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
package org.agorava.empireavenue.jackson;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * @author Rajmahendra Hegde
 * @since 0.7.0
 */
abstract class CountResponseMixin extends ResponseMixin {
    @JsonCreator
    CountResponseMixin(@JsonProperty("meta")
                       MetaMixin meta,
                       @JsonProperty("data")
                       List<CountMixin> data) {
        super(meta);
    }

    @JsonProperty("data")
    abstract List<CountMixin> getData();
}
