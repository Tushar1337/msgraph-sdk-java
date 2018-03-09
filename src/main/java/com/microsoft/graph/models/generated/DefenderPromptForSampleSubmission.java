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
 * The Enum Defender Prompt For Sample Submission.
*/
public enum DefenderPromptForSampleSubmission
{
    /**
    * user Defined
    */
    USER_DEFINED,
    /**
    * always Prompt
    */
    ALWAYS_PROMPT,
    /**
    * prompt Before Sending Personal Data
    */
    PROMPT_BEFORE_SENDING_PERSONAL_DATA,
    /**
    * never Send Data
    */
    NEVER_SEND_DATA,
    /**
    * send All Data Without Prompting
    */
    SEND_ALL_DATA_WITHOUT_PROMPTING,
    /**
    * For DefenderPromptForSampleSubmission values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
