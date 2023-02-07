// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;


/**
 * The Enum Online Meeting Role.
*/
public enum OnlineMeetingRole
{
    /**
    * attendee
    */
    ATTENDEE,
    /**
    * presenter
    */
    PRESENTER,
    /**
    * unknown Future Value
    */
    UNKNOWN_FUTURE_VALUE,
    /**
    * producer
    */
    PRODUCER,
    /**
    * coorganizer
    */
    COORGANIZER,
    /**
    * For OnlineMeetingRole values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
