/*
 * energy-ade-citygml4j - Energy ADE module for citygml4j
 * https://github.com/citygml4j/energy-ade-citygml4j
 *
 * energy-ade-citygml4j is part of the citygml4j project
 *
 * Copyright 2013-2019 Claus Nagel <claus.nagel@gmail.com>
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

package org.citygml4j.ade.energy;

import org.citygml4j.ade.energy.bind.EnergyADEMarshaller;
import org.citygml4j.ade.energy.bind.EnergyADEUnmarshaller;
import org.citygml4j.ade.energy.model.module.EnergyADEModule;
import org.citygml4j.ade.energy.walker.EnergyADEFeatureFunctionWalker;
import org.citygml4j.ade.energy.walker.EnergyADEFeatureWalker;
import org.citygml4j.ade.energy.walker.EnergyADEGMLFunctionWalker;
import org.citygml4j.ade.energy.walker.EnergyADEGMLWalker;
import org.citygml4j.model.citygml.ade.binding.ADEContext;
import org.citygml4j.model.citygml.ade.binding.ADEMarshaller;
import org.citygml4j.model.citygml.ade.binding.ADEUnmarshaller;
import org.citygml4j.model.citygml.ade.binding.ADEWalker;
import org.citygml4j.model.module.ade.ADEModule;
import org.citygml4j.util.walker.FeatureFunctionWalker;
import org.citygml4j.util.walker.FeatureWalker;
import org.citygml4j.util.walker.GMLFunctionWalker;
import org.citygml4j.util.walker.GMLWalker;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class EnergyADEContext implements ADEContext {
    private final List<ADEModule> modules = Collections.singletonList(EnergyADEModule.v1_0);

    @Override
    public List<ADEModule> getADEModules() {
        return modules;
    }

    @Override
    public List<String> getModelPackageNames() {
        return Arrays.asList("org.citygml4j.ade.energy.model.core",
                "org.citygml4j.ade.energy.model.buildingPhysics",
                "org.citygml4j.ade.energy.model.materialAndConstruction",
                "org.citygml4j.ade.energy.model.occupantBehaviour",
                "org.citygml4j.ade.energy.model.supportingClasses");
    }

    @Override
    public ADEMarshaller createADEMarshaller() {
        return new EnergyADEMarshaller();
    }

    @Override
    public ADEUnmarshaller createADEUnmarshaller() {
        return new EnergyADEUnmarshaller();
    }

    @Override
    public ADEWalker<FeatureWalker> createDefaultFeatureWalker() {
        return new EnergyADEFeatureWalker();
    }

    @Override
    public ADEWalker<GMLWalker> createDefaultGMLWalker() {
        return new EnergyADEGMLWalker();
    }

    @Override
    public <T> ADEWalker<FeatureFunctionWalker<T>> createDefaultFeatureFunctionWalker() {
        return new EnergyADEFeatureFunctionWalker<>();
    }

    @Override
    public <T> ADEWalker<GMLFunctionWalker<T>> createDefaultGMLFunctionWalker() {
        return new EnergyADEGMLFunctionWalker<>();
    }
}
