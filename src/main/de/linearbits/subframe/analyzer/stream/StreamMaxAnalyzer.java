/*
 * SUBFRAME - Simple Java Benchmarking Framework
 * Copyright (C) 2012 - 2016 Fabian Prasser and contributors
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 */
package de.linearbits.subframe.analyzer.stream;

import de.linearbits.subframe.analyzer.Analyzer;

/**
 * A stream analyzer that computes the maximum
 * @author Fabian Prasser
 */
public class StreamMaxAnalyzer extends StreamAnalyzer{

    /**
     * Creates a new instance
     */
    public StreamMaxAnalyzer(){
        super(Analyzer.MAXIMUM);
        value = Double.MIN_VALUE;
    }

    @Override
    public void add(Double val) {
        value = Math.max(value, val);
    }

    @Override
    public Analyzer<Double> newInstance() {
        return new StreamMaxAnalyzer();
    }
}
