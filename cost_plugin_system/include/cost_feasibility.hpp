/*
 * Copyright (C) 2020 LEIDOS.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */

#include "cost_plugins.hpp"

namespace cost_plugin_system
{
class CostofFeasibility : public CostPlugins
{
public:
    CostofFeasibility(double max_accelaration, double max_deceleration);

    double compute_cost(cav_msgs::ManeuverPlan plan) const;
    double normalize_cost(double cost, double size) const;

private:
    double max_accelaration_;
    double max_deceleration_;
};
} // namespace cost_plugin_system