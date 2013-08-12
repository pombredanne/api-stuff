/**
 *  Copyright 2012 Wordnik, Inc.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
 
package com.wordnik.api.client.model

import com.wordnik.swagger.runtime.annotations._

import scala.reflect.BeanProperty

import scala.collection.JavaConversions._

import scala.collection.mutable.ListBuffer


/**
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program. Do not edit the class manually.
 *
 * @author tony
 *
 */
class FrequencySummary extends Object {

	/**
	 * 
	 * 
	 * 
	 */
    @BeanProperty
    var unknownYearCount:Integer =_

	/**
	 * 
	 * 
	 * 
	 */
    @BeanProperty
    var totalCount:Long =_

	/**
	 * 
	 * 
	 * 
	 */
    @BeanProperty
    var word:String =_

	/**
	 * 
	 * 
	 * 
	 */
	var frequency  =  new ListBuffer[Frequency]
	def getFrequency:java.util.List[com.wordnik.api.client.model.Frequency] = {
	    frequency.toList
	}
	def setFrequency(args:java.util.List[com.wordnik.api.client.model.Frequency]) = {
	    frequency.clear
	    args.foreach(arg=>frequency += arg)
	}

    override def toString:String = {
        "[" +
        "unknownYearCount:" + unknownYearCount + 
            "totalCount:" + totalCount + 
            "word:" + word + 
            "frequency:" + frequency + "]"
    }
}