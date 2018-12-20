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
    private final ADEMarshaller marshaller = new EnergyADEMarshaller();
    private final ADEUnmarshaller unmarshaller = new EnergyADEUnmarshaller();

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
    public List<String> getJAXBPackageNames() {
        return Collections.singletonList("org.sig3d.citygml._2.energy._1");
    }

    @Override
    public ADEMarshaller getADEMarshaller() {
        return marshaller;
    }

    @Override
    public ADEUnmarshaller getADEUnmarshaller() {
        return unmarshaller;
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
