/*
 * Copyright (C) Huawei Technologies Co., Ltd. 2021-2021. All rights reserved
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.huawei.flowre.flowreplay.domain.result;

import lombok.Getter;
import lombok.Setter;

import java.util.Map;

/**
 * http请求的入参数据封装
 *
 * @author lihongjiang
 * @version 0.0.1
 * @since 2021-08-16
 */
@Getter
@Setter
public class HttpRequestEntity {
    private String url;

    private String method;

    private Map<String, String> headMap;

    private String httpRequestBody;
}