package com.otracking.tool;

public class ProgressBar {

	public static String getProgressBar(String success, String info, String warning, String danger) {
		return "<div class='progress'><div class='progress-bar progress-bar-success' style='width: " + success
		        + "'></div><div class='progress-bar progress-bar-info' style='width: " + info
		        + "'></div><div class='progress-bar progress-bar-warning progress-bar-striped' style='width: " + warning
		        + "'></div><div class='progress-bar progress-bar-danger' style='width: " + danger + "'></div></div>";
	}
}
