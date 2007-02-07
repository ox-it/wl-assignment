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

import java.util.List;

/**
 * A service that produces activities that can be tagged.
 * 
 * @author The Sakai Foundation.
 */
public interface TaggableActivityProducer {

	/**
	 * Method to check if this producer handles the given reference.
	 * 
	 * @param ref
	 *            A reference for an object produced by a taggable activity
	 *            producer.
	 * @return True if this producer handles the reference, false otherwise.
	 */
	public boolean checkReference(String ref);

	/**
	 * Method to get the context of the object represented by this reference.
	 * 
	 * @param ref
	 *            A reference for an object produced by a taggable activity
	 *            producer.
	 * @return The context of the referenced object.
	 */
	public String getContext(String ref);

	/**
	 * Method to get a displayable name for the producing service.
	 * 
	 * @return A common displayable name for this service.
	 */
	public String getName();

	/**
	 * Method to get the unique identifier for this producing service.
	 * 
	 * @return A unique identifier for this service.
	 */
	public String getId();

	/**
	 * Method to get a list of all taggable activities within the given context.
	 * 
	 * @param context
	 *            The context to search.
	 * @param provider
	 *            The provider that is getting the activities. This allows the
	 *            producer to selectively return different lists of activities
	 *            depending on the given provider.
	 * @return A list, possibly empty, of all taggable activities within the
	 *         given context.
	 */
	public List<TaggableActivity> getActivities(String context,
			TaggingProvider provider);

	/**
	 * Method to get a taggable activity by reference string.
	 * 
	 * @param activityRef
	 *            A reference for the taggable activity.
	 * @param provider
	 *            The provider that is getting the activity. This allows the
	 *            producer to selectively return an activity, or none at all,
	 *            depending on the given provider.
	 * @return The taggable activity, or null if no such activity exists or the
	 *         provider cannot access it.
	 */
	public TaggableActivity getActivity(String activityRef,
			TaggingProvider provider);

	/**
	 * Method to get a list of items for an activity.
	 * 
	 * @param activity
	 *            The activity that contains the items to retrieve.
	 * @param provider
	 *            The provider that is getting the items. This allows the
	 *            producer to selectively return different lists of items
	 *            depending on the given provider.
	 * @return A list of items for the given activity.
	 */
	public List<TaggableItem> getItems(TaggableActivity activity,
			TaggingProvider provider);

	/**
	 * Method to get a list of items belonging to a specific user for an
	 * activity.
	 * 
	 * @param activity
	 *            The activity that contains the items to retrieve.
	 * @param userId
	 *            The identifier of the user who submitted the items for the
	 *            given activity.
	 * @param provider
	 *            The provider that is getting the items. This allows the
	 *            producer to selectively return different lists of items
	 *            depending on the given provider.
	 * @return A list of items submitted by the specified user for the given
	 *         activity.
	 */
	public List<TaggableItem> getItems(TaggableActivity activity,
			String userId, TaggingProvider provider);

	/**
	 * Method to get a taggable item by reference string.
	 * 
	 * @param itemRef
	 *            The reference for the taggable item.
	 * @param provider
	 *            The provider that is getting the item. This allows the
	 *            producer to selectively return an item, or none at all,
	 *            depending on the given provider.
	 * @return The taggable item, or null if no such item exists or the provider
	 *         cannot access it.
	 */
	public TaggableItem getItem(String itemRef, TaggingProvider provider);
}
