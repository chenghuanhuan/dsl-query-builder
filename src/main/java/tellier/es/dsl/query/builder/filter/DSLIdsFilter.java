/****************************************************************
 * Licensed to the Apache Software Foundation (ASF) under one   *
 * or more contributor license agreements.  See the NOTICE file *
 * distributed with this work for additional information        *
 * regarding copyright ownership.  The ASF licenses this file   *
 * to you under the Apache License, Version 2.0 (the            *
 * "License"); you may not use this file except in compliance   *
 * with the License.  You may obtain a copy of the License at   *
 *                                                              *
 *   http://www.apache.org/licenses/LICENSE-2.0                 *
 *                                                              *
 * Unless required by applicable law or agreed to in writing,   *
 * software distributed under the License is distributed on an  *
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY       *
 * KIND, either express or implied.  See the License for the    *
 * specific language governing permissions and limitations      *
 * under the License.                                           *
 ****************************************************************/
package tellier.es.dsl.query.builder.filter;

import com.google.gson.JsonObject;
import tellier.es.dsl.query.builder.query.DSLIdsQuery;

/**
 * Represents an IDs filter.
 * 
 * See http://www.elasticsearch.org/guide/en/elasticsearch/reference/current/query-dsl-ids-filter.html
 */
public class DSLIdsFilter implements DSLFilter {
    
    private DSLIdsQuery query = new DSLIdsQuery();

    public DSLIdsFilter addValue(String value) {
        query.addValue(value);
        return this;
    }

    public DSLIdsFilter addType(String type) {
        query.addType(type);
        return this;
    }

    public JsonObject getFilterAsJson() {
        return query.getQueryAsJson();
    }
    
}
