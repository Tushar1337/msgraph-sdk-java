// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.generated;

import com.microsoft.graph.concurrency.*;
import com.microsoft.graph.core.*;
import com.microsoft.graph.models.extensions.*;
import com.microsoft.graph.models.generated.*;
import com.microsoft.graph.http.*;
import com.microsoft.graph.requests.extensions.*;
import com.microsoft.graph.requests.generated.*;
import com.microsoft.graph.options.*;
import com.microsoft.graph.serializer.*;

import java.util.Arrays;
import java.util.EnumSet;

/**
 * The Enum Automatic Update Mode.
*/
public enum AutomaticUpdateMode
{
    /**
    * user Defined
    */
    USER_DEFINED,
    /**
    * notify Download
    */
    NOTIFY_DOWNLOAD,
    /**
    * auto Install At Maintenance Time
    */
    AUTO_INSTALL_AT_MAINTENANCE_TIME,
    /**
    * auto Install And Reboot At Maintenance Time
    */
    AUTO_INSTALL_AND_REBOOT_AT_MAINTENANCE_TIME,
    /**
    * auto Install And Reboot At Scheduled Time
    */
    AUTO_INSTALL_AND_REBOOT_AT_SCHEDULED_TIME,
    /**
    * auto Install And Reboot Without End User Control
    */
    AUTO_INSTALL_AND_REBOOT_WITHOUT_END_USER_CONTROL,
    /**
    * For AutomaticUpdateMode values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
