/*
 * Copyright 2002 Sun Microsystems, Inc. All rights reserved.
 * SUN PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.sun.s1asdev.ejb.ejb30.hello.session;

import javax.ejb.Remote;

@Remote
public interface Sless
{
    public String hello();

    public com.sun.ejb.containers.TimerSchedule foo ();
}
