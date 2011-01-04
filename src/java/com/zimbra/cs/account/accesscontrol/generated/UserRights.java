/*
 * ***** BEGIN LICENSE BLOCK *****
 * Zimbra Collaboration Suite Server
 * Copyright (C) 2009, 2010 Zimbra, Inc.
 * 
 * The contents of this file are subject to the Zimbra Public License
 * Version 1.3 ("License"); you may not use this file except in
 * compliance with the License.  You may obtain a copy of the License at
 * http://www.zimbra.com/license.
 * 
 * Software distributed under the License is distributed on an "AS IS"
 * basis, WITHOUT WARRANTY OF ANY KIND, either express or implied.
 * ***** END LICENSE BLOCK *****
 */
package com.zimbra.cs.account.accesscontrol.generated;

import com.zimbra.common.service.ServiceException;
import com.zimbra.cs.account.accesscontrol.Right;
import com.zimbra.cs.account.accesscontrol.RightManager;
import com.zimbra.cs.account.accesscontrol.UserRight;

//
// DO NOT MODIFY - generated by RightManager
//
// To generate, under ZimbraServer, run: 
//    ant generate-rights
//

public class UserRights {
    
    ///// BEGIN-AUTO-GEN-REPLACE

    /* build: 7.0.0_BETA1_1111 pshao 20110103-2343 */


    public static UserRight R_invite;
    public static UserRight R_loginAs;
    public static UserRight R_sendAs;
    public static UserRight R_sendToDistList;
    public static UserRight R_viewDistList;
    public static UserRight R_viewFreeBusy;


    public static void init(RightManager rm) throws ServiceException {
        R_invite                               = rm.getUserRight(Right.RT_invite);
        R_loginAs                              = rm.getUserRight(Right.RT_loginAs);
        R_sendAs                               = rm.getUserRight(Right.RT_sendAs);
        R_sendToDistList                       = rm.getUserRight(Right.RT_sendToDistList);
        R_viewDistList                         = rm.getUserRight(Right.RT_viewDistList);
        R_viewFreeBusy                         = rm.getUserRight(Right.RT_viewFreeBusy);
    }

    ///// END-AUTO-GEN-REPLACE
}
