/*
 * Copyright (C) 2022-2022 Huawei Technologies Co., Ltd. All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 *
 */

package com.huawei.flowcontrol.common.config;

import com.huaweicloud.sermant.core.config.common.ConfigFieldKey;
import com.huaweicloud.sermant.core.config.common.ConfigTypeKey;
import com.huaweicloud.sermant.core.plugin.config.PluginConfig;

/**
 * 指标监控配置
 *
 * @author zhp
 * @since 2022-09-14
 */
@ConfigTypeKey("metric.server.config")
public class MetricConfig implements PluginConfig {
    /**
     * 监控启动开关
     */
    @ConfigFieldKey("enable-start-monitor")
    private boolean enableStartMonitor;

    public boolean isEnableStartMonitor() {
        return enableStartMonitor;
    }

    public void setEnableStartMonitor(boolean enableStartMonitor) {
        this.enableStartMonitor = enableStartMonitor;
    }
}
