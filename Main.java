/**
 * Main.java - Driver class to demonstrate revised historical examples
 * 
 * @author ???
 * @version ???
 */

public class Main {
	public static void main(String[] args) {

		String tulsaDescription = "A black teenager, who was working as a shoe shiner in downtown Tulsa, Oklahoma, was arrested and accused of assaulting a white woman on a public elevator in broad daylight. A group of white vigilantes, intent on lynching him, and armed black men intent on protecting him gathered at the courthouse. A shot rang out, and the violence began. The riot resulted in 35 square blocks of destruction, including more than 1,250 homes, churches, schools, businesses, a hospital, and a library.";
		Date tulsaDay = new Date(5, 31, 1921);
		HistoricalEvent tulsaRiot = new HistoricalEvent(tulsaDescription, tulsaDay);

		//System.out.println("====================================================");
		//System.out.println("HISTORICAL EVENT EXAMPLE:");
		//System.out.println("====================================================");
		//System.out.println(tulsaRiot);
		tulsaRiot.teach();
		
		
		String tulsaRevised = "It started with newspaper reports that a black man had assaulted a white elevator operator. He was arrested, and black World War I vets rushed to the courthouse to prevent a lynching. Whites were deputized and handed weapons, the shooting started and then it got out of hand. It was mob rule for two days, and the result was the complete devastation of the entire black community. The white mobs looted the homes and businesses before they set fire to the community. Planes circled mid-air and bombed what was known as Black Wall Street. The National Guard was called out after the governor declared martial law, and imprisoned all blacks that were not already in jail. More than 35 blocks were destroyed, along with more than 1,200 homes, and some 300 people died, mostly Blacks.",
			tulsaCitation = "https://www.smithsonianmag.com/smithsonian-institution/long-lost-manuscript-contains-searing-eyewitness-account-tulsa-race-massacre-1921-180959251/";
		RevisedHistoricalEvent tulsaMassacre = new RevisedHistoricalEvent(tulsaDescription, tulsaDay,
			tulsaRevised, tulsaCitation);
		
		//System.out.println("\n====================================================");
		//System.out.println("REVISED HISTORICAL EVENT EXAMPLE:");
		//System.out.println("====================================================");
		tulsaMassacre.teach();

		String wowDescription = "The releasse of World of Warcraft was revolutionary to not only the gaming market but to MMO's as a whole. With only a couple similar games being released before World of Warcraft, such as Ultima Online and Everquest, the release of World of Warcraft caused the MMORPG genre to blow up in popularity and changed gaming for most in the forseeable future. Millions of active users still play to this day and many new MMORPG's come out each year with inspiration being taken from World of Warcraft.";
		String wowDescriptionTwo = "If you ever see an MMO, remember the game that inspired all of those, and those who made it great!";
		Date wowDate = new Date(11, 22, 2004);
		String wowCitation = "Source: https://en.wikipedia.org/wiki/World_of_Warcraft";
		RevisedHistoricalEvent wowRelease = new RevisedHistoricalEvent(wowDescription, wowDate, wowDescriptionTwo,
				wowCitation);
		wowRelease.teach();
	}
}