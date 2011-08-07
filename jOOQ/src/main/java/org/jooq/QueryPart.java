/**
 * Copyright (c) 2009-2011, Lukas Eder, lukas.eder@gmail.com
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
package org.jooq;

import org.jooq.impl.Factory;

/**
 * The common base type for all objects that can be used for query composition.
 * <p>
 * All <code>QueryPart</code> implementations can be cast to
 * {@link QueryPartInternal} in order to access the internal API. See also
 * {@link #internalAPI(Class)}
 * <p>
 * A <code>QueryPart</code> essentially combines the {@link Attachable}
 * interface with SQL code generation and variable binding functionality.
 *
 * @author Lukas Eder
 */
public interface QueryPart extends Attachable {

    /**
     * Retrieve the SQL code rendered by this query part.
     *
     * @deprecated - 1.6.4 [#758][#776] - Use
     *             {@link RenderContext#render(QueryPart)} or
     *             {@link Factory#render(QueryPart)}, or {@link Query#getSQL()}
     *             instead.
     *             <p>
     *             The internals of query rendering have been changed
     *             fundamentally. It is not recommended to render a
     *             {@link QueryPart} outside the scope of a
     *             {@link Configuration} or a {@link RenderContext}.
     *             <p>
     *             The rationale is this: A {@link QueryPart} is
     *             {@link Configuration}-independent, hence it cannot know what
     *             kind of {@link SQLDialect} should be used for rendering. Some
     *             {@link QueryPart}'s are highly dependent on the SQL dialect.
     *             Instead, {@link RenderContext#render(QueryPart)} or
     *             {@link Factory#render(QueryPart)} should be used.
     */
    @Deprecated
    String getSQL();
}
