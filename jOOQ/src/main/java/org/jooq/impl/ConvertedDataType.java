/**
 * Copyright (c) 2009-2012, Lukas Eder, lukas.eder@gmail.com
 * All rights reserved.
 *
 * This software is licensed to you under the Apache License, Version 2.0
 * (the "License"); You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * . Redistributions of source code must retain the above copyright notice, this
 *   list of conditions and the following disclaimer.
 *
 * . Redistributions in binary form must reproduce the above copyright notice,
 *   this list of conditions and the following disclaimer in the documentation
 *   and/or other materials provided with the distribution.
 *
 * . Neither the name "jOOQ" nor the names of its contributors may be
 *   used to endorse or promote products derived from this software without
 *   specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
 * ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE
 * LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 * CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF
 * SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS
 * INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN
 * CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
 * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE
 * POSSIBILITY OF SUCH DAMAGE.
 */
package org.jooq.impl;

import org.jooq.Configuration;
import org.jooq.Converter;
import org.jooq.DataType;

/**
 * A <code>DataType</code> used for converted types using {@link Converter}
 *
 * @author Lukas Eder
 */
class ConvertedDataType<T, U> extends AbstractDataType<U> {

    /**
     * Generated UID
     */
    private static final long             serialVersionUID = -2321926692580974126L;

    private final DataType<T>             delegate;
    private final Converter<? super T, U> converter;

    ConvertedDataType(DataType<T> delegate, Converter<? super T, U> converter) {
        super(null, null,
            converter.toType(),
            delegate.getTypeName(),
            delegate.getCastTypeName());

        this.delegate = delegate;
        this.converter = converter;

        DataTypes.registerConverter(converter.toType(), converter);
    }

    @Override
    public int getSQLType() {
        return delegate.getSQLType();
    }

    @Override
    public String getTypeName(Configuration configuration) {
        return delegate.getTypeName(configuration);
    }

    @Override
    public String getCastTypeName(Configuration configuration) {
        return delegate.getCastTypeName(configuration);
    }

    @SuppressWarnings("deprecation")
    @Override
    public String getCastTypeName(Configuration configuration, int precision, int scale) {
        return delegate.getCastTypeName(configuration, precision, scale);
    }

    @SuppressWarnings("unchecked")
    @Override
    public U convert(Object object) {
        return converter.from(delegate.convert(converter.to((U) object)));
    }
}
