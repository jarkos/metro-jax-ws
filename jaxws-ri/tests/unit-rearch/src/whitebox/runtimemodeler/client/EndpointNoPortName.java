/*
 * Copyright (c) 2013, 2018 Oracle and/or its affiliates. All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Distribution License v. 1.0, which is available at
 * http://www.eclipse.org/org/documents/edl-v10.php.
 *
 * SPDX-License-Identifier: BSD-3-Clause
 */

/*
 * $Id: EndpointNoPortName.java,v 1.1.2.1 2007/01/05 03:32:14 vivekp Exp $
 */

package whitebox.runtimemodeler.client;

import javax.jws.*;
import javax.jws.soap.SOAPBinding;

import java.rmi.RemoteException;

import javax.xml.ws.Holder;


@WebService(name="RpcLit")
@SOAPBinding(style=SOAPBinding.Style.RPC)
public class EndpointNoPortName {


    @WebMethod
    public Integer echoInteger(Integer param) {
        return param;
    }
}

