/**
 * Copyright (c) 2012, 2013, Huawei Technologies Co., Ltd.
 * All rights reserved.
 * 
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met: 
 * 
 * 1. Redistributions of source code must retain the above copyright notice, this
 *    list of conditions and the following disclaimer. 
 * 2. Redistributions in binary form must reproduce the above copyright notice,
 *    this list of conditions and the following disclaimer in the documentation
 *    and/or other materials provided with the distribution. 
 * 
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR
 * ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */

package org.openflow.experimenter.huawei;

import org.openflow.protocol.Instantiable;
import org.openflow.protocol.experimenter.OFExperimenterData;

/**
 * Subclass of OFVendorData representing the vendor data associated with
 * a role request vendor extension.
 * 
 * @author Rob Vaterlaus (rob.vaterlaus@bigswitch.com)
 */
public class OFHuaweiRoleRequestExperimenterData extends OFHuaweiRoleExperimenterData {

    protected static Instantiable<OFExperimenterData> instantiable =
            new Instantiable<OFExperimenterData>() {
                public OFExperimenterData instantiate() {
                    return new OFHuaweiRoleRequestExperimenterData();
                }
            };

    /**
     * @return a subclass of Instantiable<OFVendorData> that instantiates
     *         an instance of OFRoleRequestVendorData.
     */
    public static Instantiable<OFExperimenterData> getInstantiable() {
        return instantiable;
    }

    /**
     * The data type value for a role request
     */
    public static final int NXT_ROLE_REQUEST = 10;

    /**
     * Construct a role request vendor data with an unspecified role value.
     */
    public OFHuaweiRoleRequestExperimenterData() {
        super(NXT_ROLE_REQUEST);
    }
    
    /**
     * Construct a role request vendor data with the specified role value.
     * @param role the role value for the role request. Should be one of
     *      NX_ROLE_OTHER, NX_ROLE_MASTER or NX_ROLE_SLAVE.
     */
    public OFHuaweiRoleRequestExperimenterData(int role) {
        super(NXT_ROLE_REQUEST, role);
    }
}
