/*
 * Copyright 2010-2012 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.simpleworkflow.model;

/**
 * <p>
 * Provides details of the <code>DecisionTaskStarted</code> event.
 * </p>
 */
public class DecisionTaskStartedEventAttributes {

    /**
     * Identity of the decider making the request. This enables diagnostic
     * tracing when problems arise. The form of this identity is user
     * defined.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     */
    private String identity;

    /**
     * The id of the <code>DecisionTaskScheduled</code> event that was
     * recorded when this decision task was scheduled. This information can
     * be useful for diagnosing problems by tracing back the chain of events
     * leading up to this event.
     */
    private Long scheduledEventId;

    /**
     * Identity of the decider making the request. This enables diagnostic
     * tracing when problems arise. The form of this identity is user
     * defined.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     *
     * @return Identity of the decider making the request. This enables diagnostic
     *         tracing when problems arise. The form of this identity is user
     *         defined.
     */
    public String getIdentity() {
        return identity;
    }
    
    /**
     * Identity of the decider making the request. This enables diagnostic
     * tracing when problems arise. The form of this identity is user
     * defined.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     *
     * @param identity Identity of the decider making the request. This enables diagnostic
     *         tracing when problems arise. The form of this identity is user
     *         defined.
     */
    public void setIdentity(String identity) {
        this.identity = identity;
    }
    
    /**
     * Identity of the decider making the request. This enables diagnostic
     * tracing when problems arise. The form of this identity is user
     * defined.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     *
     * @param identity Identity of the decider making the request. This enables diagnostic
     *         tracing when problems arise. The form of this identity is user
     *         defined.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DecisionTaskStartedEventAttributes withIdentity(String identity) {
        this.identity = identity;
        return this;
    }
    
    
    /**
     * The id of the <code>DecisionTaskScheduled</code> event that was
     * recorded when this decision task was scheduled. This information can
     * be useful for diagnosing problems by tracing back the chain of events
     * leading up to this event.
     *
     * @return The id of the <code>DecisionTaskScheduled</code> event that was
     *         recorded when this decision task was scheduled. This information can
     *         be useful for diagnosing problems by tracing back the chain of events
     *         leading up to this event.
     */
    public Long getScheduledEventId() {
        return scheduledEventId;
    }
    
    /**
     * The id of the <code>DecisionTaskScheduled</code> event that was
     * recorded when this decision task was scheduled. This information can
     * be useful for diagnosing problems by tracing back the chain of events
     * leading up to this event.
     *
     * @param scheduledEventId The id of the <code>DecisionTaskScheduled</code> event that was
     *         recorded when this decision task was scheduled. This information can
     *         be useful for diagnosing problems by tracing back the chain of events
     *         leading up to this event.
     */
    public void setScheduledEventId(Long scheduledEventId) {
        this.scheduledEventId = scheduledEventId;
    }
    
    /**
     * The id of the <code>DecisionTaskScheduled</code> event that was
     * recorded when this decision task was scheduled. This information can
     * be useful for diagnosing problems by tracing back the chain of events
     * leading up to this event.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param scheduledEventId The id of the <code>DecisionTaskScheduled</code> event that was
     *         recorded when this decision task was scheduled. This information can
     *         be useful for diagnosing problems by tracing back the chain of events
     *         leading up to this event.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DecisionTaskStartedEventAttributes withScheduledEventId(Long scheduledEventId) {
        this.scheduledEventId = scheduledEventId;
        return this;
    }
    
    
    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (identity != null) sb.append("Identity: " + identity + ", ");
        if (scheduledEventId != null) sb.append("ScheduledEventId: " + scheduledEventId + ", ");
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getIdentity() == null) ? 0 : getIdentity().hashCode()); 
        hashCode = prime * hashCode + ((getScheduledEventId() == null) ? 0 : getScheduledEventId().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
    
        if (obj instanceof DecisionTaskStartedEventAttributes == false) return false;
        DecisionTaskStartedEventAttributes other = (DecisionTaskStartedEventAttributes)obj;
        
        if (other.getIdentity() == null ^ this.getIdentity() == null) return false;
        if (other.getIdentity() != null && other.getIdentity().equals(this.getIdentity()) == false) return false; 
        if (other.getScheduledEventId() == null ^ this.getScheduledEventId() == null) return false;
        if (other.getScheduledEventId() != null && other.getScheduledEventId().equals(this.getScheduledEventId()) == false) return false; 
        return true;
    }
    
}
    