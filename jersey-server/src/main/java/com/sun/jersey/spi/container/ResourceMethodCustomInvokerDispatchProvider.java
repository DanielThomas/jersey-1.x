/*
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS HEADER.
 *
 * Copyright (c) 2011-2015 Oracle and/or its affiliates. All rights reserved.
 *
 * The contents of this file are subject to the terms of either the GNU
 * General Public License Version 2 only ("GPL") or the Common Development
 * and Distribution License("CDDL") (collectively, the "License").  You
 * may not use this file except in compliance with the License.  You can
 * obtain a copy of the License at
 * http://glassfish.java.net/public/CDDL+GPL_1_1.html
 * or packager/legal/LICENSE.txt.  See the License for the specific
 * language governing permissions and limitations under the License.
 *
 * When distributing the software, include this License Header Notice in each
 * file and include the License file at packager/legal/LICENSE.txt.
 *
 * GPL Classpath Exception:
 * Oracle designates this particular file as subject to the "Classpath"
 * exception as provided by Oracle in the GPL Version 2 section of the License
 * file that accompanied this code.
 *
 * Modifications:
 * If applicable, add the following below the License Header, with the fields
 * enclosed by brackets [] replaced by your own identifying information:
 * "Portions Copyright [year] [name of copyright owner]"
 *
 * Contributor(s):
 * If you wish your version of this file to be governed by only the CDDL or
 * only the GPL Version 2, indicate your decision by adding "[Contributor]
 * elects to include this software in this distribution under the [CDDL or GPL
 * Version 2] license."  If you don't indicate a single choice of license, a
 * recipient has the option to distribute your version of this file under
 * either the CDDL, the GPL Version 2 or to extend the choice of license to
 * its licensees as provided above.  However, if you add GPL Version 2 code
 * and therefore, elected the GPL Version 2 license, then the option applies
 * only if the new code is made subject to such option by the copyright
 * holder.
 */

package com.sun.jersey.spi.container;

import com.sun.jersey.api.model.AbstractResourceMethod;
import com.sun.jersey.spi.dispatch.RequestDispatcher;

/**
 * Service-provider interface for creating {@link RequestDispatcher} instances.
 * <p>
 * An implementation (a service-provider) identifies itself by placing a
 * provider-configuration file (if not already present),
 * "com.sun.research.ws.rest.spi.invoker.ResourceMethodCustomInvokerDispatchProvider" in the
 * resource directory <tt>META-INF/services</tt>, and including the fully qualified
 * service-provider-class of the implementation in the file.
 * <p>
 * This interface is similar to {@link ResourceMethodDispatchProvider}, but allows
 * to use a custom {@link JavaMethodInvoker} instance, which will be used to make
 * the final Java method call.
 *
 * @author Jakub.Podlesak@Oracle.com
 */
public interface ResourceMethodCustomInvokerDispatchProvider {

    /**
     * Create a {@link RequestDispatcher} for a resource method of
     * a resource.
     *
     * @param abstractResourceMethod the abstract resource method.
     * @param invoker custom Java method invoker instance
     * @return the request dispatcher, otherwise null if it could not be created
     *         for the abstract resource method.
     */
    RequestDispatcher create(AbstractResourceMethod abstractResourceMethod, JavaMethodInvoker invoker);
}
