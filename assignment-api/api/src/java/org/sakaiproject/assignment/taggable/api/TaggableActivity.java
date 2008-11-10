/**********************************************************************************
 * $URL$
 * $Id$
 ***********************************************************************************
 *
 * Copyright (c) 2006, 2007 The Sakai Foundation.
 *
 * Licensed under the Educational Community License, Version 1.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.opensource.org/licenses/ecl1.php
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 **********************************************************************************/

package org.sakaiproject.assignment.taggable.api;

/**
 * An activity that can be tagged.
 * 
 * @author The Sakai Foundation.
 */
public interface TaggableActivity {

	/**
	 * Method to get the base object that is wrapped as an activity.
	 * 
	 * @return The base object.
	 */
	public Object getObject();

	/**
	 * @return A reference for this activity. This needs to return a valid
	 *         reference to an activity.
	 */
	public String getReference();

	/**
	 * @return A title for this activity.
	 */
	public String getTitle();

	/**
	 * @return A description for this activity.
	 */
	public String getDescription();

	/**
	 * @return The context of this activity.
	 */
	public String getContext();

	/**
	 * @return This activity's producer.
	 */
	public TaggableActivityProducer getProducer();
}