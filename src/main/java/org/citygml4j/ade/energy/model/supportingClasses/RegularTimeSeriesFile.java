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

package org.citygml4j.ade.energy.model.supportingClasses;

import org.citygml4j.builder.copy.CopyBuilder;

public class RegularTimeSeriesFile extends AbstractTimeSeries {
    private String uom;
    private String file;
    private TimePeriodProperty temporalExtent;
    private TimeIntervalLength timeInterval;
    private Integer numberOfHeaderLines;
    private String fieldSeparator;
    private String recordSeparator;
    private String decimalSymbol;
    private Integer valueColumnNumber;

    public String getUom() {
        return uom;
    }

    public boolean isSetUom() {
        return uom != null;
    }

    public void setUom(String uom) {
        this.uom = uom;
    }

    public String getFile() {
        return file;
    }

    public boolean isSetFile() {
        return file != null;
    }

    public void setFile(String file) {
        this.file = file;
    }

    public TimePeriodProperty getTemporalExtent() {
        return temporalExtent;
    }

    public boolean isSetTemporalExtent() {
        return temporalExtent != null;
    }

    public void setTemporalExtent(TimePeriodProperty temporalExtent) {
        if (temporalExtent != null)
            temporalExtent.setParent(this);

        this.temporalExtent = temporalExtent;
    }

    public TimeIntervalLength getTimeInterval() {
        return timeInterval;
    }

    public boolean isSetTimeInterval() {
        return timeInterval != null;
    }

    public void setTimeInterval(TimeIntervalLength timeInterval) {
        if (timeInterval != null)
            timeInterval.setParent(this);

        this.timeInterval = timeInterval;
    }

    public Integer getNumberOfHeaderLines() {
        return numberOfHeaderLines != null ? numberOfHeaderLines : 0;
    }

    public boolean isSetNumberOfHeaderLines() {
        return numberOfHeaderLines != null;
    }

    public void setNumberOfHeaderLines(Integer numberOfHeaderLines) {
        this.numberOfHeaderLines = numberOfHeaderLines;
    }

    public String getFieldSeparator() {
        return fieldSeparator;
    }

    public boolean isSetFieldSeparator() {
        return fieldSeparator != null;
    }


    public void setFieldSeparator(String fieldSeparator) {
        this.fieldSeparator = fieldSeparator;
    }

    public String getRecordSeparator() {
        return recordSeparator != null ? recordSeparator : "\\n";
    }

    public boolean isSetRecordSeparator() {
        return recordSeparator != null;
    }

    public void setRecordSeparator(String recordSeparator) {
        this.recordSeparator = recordSeparator;
    }

    public String getDecimalSymbol() {
        return decimalSymbol != null ? decimalSymbol : ".";
    }

    public boolean isSetDecimalSymbol() {
        return decimalSymbol != null;
    }

    public void setDecimalSymbol(String decimalSymbol) {
        this.decimalSymbol = decimalSymbol;
    }

    public Integer getValueColumnNumber() {
        return valueColumnNumber != null ? valueColumnNumber : 1;
    }

    public boolean isSetValueColumnNumber() {
        return valueColumnNumber != null;
    }

    public void setValueColumnNumber(Integer valueColumnNumber) {
        this.valueColumnNumber = valueColumnNumber;
    }

    @Override
    public Object copy(CopyBuilder copyBuilder) {
        return copyTo(new RegularTimeSeriesFile(), copyBuilder);
    }

    @Override
    public Object copyTo(Object target, CopyBuilder copyBuilder) {
        RegularTimeSeriesFile copy = (target == null) ? new RegularTimeSeriesFile() : (RegularTimeSeriesFile)target;

        if (isSetFile())
            copy.setFile(copyBuilder.copy(file));

        if (isSetTemporalExtent())
            copy.setTemporalExtent((TimePeriodProperty)copyBuilder.copy(temporalExtent));

        if (isSetTimeInterval())
            copy.setTimeInterval((TimeIntervalLength)copyBuilder.copy(timeInterval));

        if (isSetNumberOfHeaderLines())
            copy.setNumberOfHeaderLines(numberOfHeaderLines);

        if (isSetFieldSeparator())
            copy.setFieldSeparator(copyBuilder.copy(fieldSeparator));

        if (isSetRecordSeparator())
            copy.setRecordSeparator(copyBuilder.copy(recordSeparator));

        if (isSetDecimalSymbol())
            copy.setDecimalSymbol(copyBuilder.copy(decimalSymbol));

        if (isSetValueColumnNumber())
            copy.setValueColumnNumber(valueColumnNumber);

        return super.copyTo(copy, copyBuilder);
    }
}
