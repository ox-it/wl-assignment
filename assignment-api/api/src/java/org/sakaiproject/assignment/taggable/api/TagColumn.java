/**********************************************************************************
 * $URL$
 * $Id$
 ***********************************************************************************
 *
 * Copyright (c) 2007 The Sakai Foundation.
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
 * Represents a specific column in a {@link TagList}.
 * 
 * @author The Sakai Foundation.
 */
public interface TagColumn {

	/**
	 * Method to get the displayable name of this column.
	 * 
	 * @return The displayable column name.
	 */
	public String getDisplayName();

	/**
	 * Method to get the name that identifies this column.
	 * 
	 * @return The name that identifies this column.
	 */
	public String getName();

	/**
	 * Method to get a string describing this column.
	 * 
	 * @return The description of this column.
	 */
	public String getDescription();

	/**
	 * Method to determine if this column is sortable.
	 * 
	 * @return True if this column is sortable, false otherwise.
	 */
	public boolean isSortable();
}