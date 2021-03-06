/*
 * JBoss, Home of Professional Open Source
 * Copyright 2008, Red Hat, Inc., and individual contributors
 * by the @authors tag. See the copyright.txt in the distribution for a
 * full listing of individual contributors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.jboss.weld.introspector;

import java.lang.reflect.Field;

public abstract class ForwardingWeldField<T, X> extends ForwardingWeldMember<T, X, Field> implements WeldField<T, X> {

    @Override
    protected abstract WeldField<T, X> delegate();

    public T get(Object instance) {
        return delegate().get(instance);
    }

    @Override
    public WeldClass<X> getDeclaringType() {
        return delegate().getDeclaringType();
    }

    public String getPropertyName() {
        return delegate().getPropertyName();
    }

    public void set(Object declaringInstance, Object value) throws IllegalArgumentException, IllegalAccessException {
        delegate().set(declaringInstance, value);
    }

    public boolean isTransient() {
        return delegate().isTransient();
    }

    public Field getJavaMember() {
        return delegate().getJavaMember();
    }

}
