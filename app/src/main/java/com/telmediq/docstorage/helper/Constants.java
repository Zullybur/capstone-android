package com.telmediq.docstorage.helper;

import com.telmediq.docstorage.BuildConfig;

/**
 * Created by sean on 2017-05-03.
 */

public class Constants {
	public static final String SERVER_URL = "https://cds.development.telmediq.com";

	public interface Preference {
		String ACCESS_TOKEN = BuildConfig.APPLICATION_ID + ".accessToken";
		String ROOT_FOLDER_ID = BuildConfig.APPLICATION_ID + ".rootFolderId";
		String DIRECTORY_LAYOUT_MODE = BuildConfig.APPLICATION_ID + ".directoryLayoutMode";
	}

	public interface Extras {
		String FILE_ID = BuildConfig.APPLICATION_ID + ".fileId";
		String FOLDER_ID = BuildConfig.APPLICATION_ID + ".folderId";
		String SEARCH_STRING = BuildConfig.APPLICATION_ID + ".searchString";
	}

	public interface Actions {
		String FILE_DELETED = BuildConfig.APPLICATION_ID + ".fileDeleted";
	}
}