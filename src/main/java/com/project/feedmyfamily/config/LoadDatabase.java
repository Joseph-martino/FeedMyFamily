//package com.project.feedmyfamily.config;
//
//import com.project.feedmyfamily.entity.*;
//import com.project.feedmyfamily.repository.*;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//import java.text.SimpleDateFormat;
//import java.util.List;
//
//@Configuration
//public class LoadDatabase {
//
//	private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);
//
//	@Bean
//	CommandLineRunner initDatabase(GroupRepo groupRepo, UserRepo userRepo, RecipeRepo recipeRepo, IngredientRepo ingredientRepo, UserGroupRepo userGroupRepo,
//								   CategoryRecipeRepo categoryRecipeRepo, IngredientRecipeRepo ingredientRecipeRepo ) {
//		return args -> {
//			// prearation des utilisateurs
//			User louis = new User("Masurel", "Louis", "louis@gmail.com");
//			User quentin = new User("Degorgue", "Quentin", "quentin@gmail.com");
//			User joseph = new User("Martino", "Joseph", "joseph@gmail.com");
//
//			// creation des groupes
//
//			Group groupe1 = new Group("La belle famille");
//			Group groupe2 = new Group("La famille avant les potes");
//
//			// ajout des personnes dans des groupes
//			UserGroup userGroup1 = new UserGroup();
//			userGroup1.setGroup(groupe1);
//			userGroup1.setUser(louis);
//			UserGroup userGroup2 = new UserGroup();
//			userGroup2.setGroup(groupe1);
//			userGroup2.setUser(joseph);
//			UserGroup userGroup3 = new UserGroup();
//			userGroup3.setGroup(groupe2);
//			userGroup3.setUser(quentin);
//			UserGroup userGroup4 = new UserGroup();
//			userGroup4.setGroup(groupe2);
//			userGroup4.setUser(joseph);
//
//			// creation d'ingrédient
//
//			Ingredient poulet = new Ingredient("Poulet", "volaille");
//			Ingredient pates = new Ingredient("Pates", "feculent");
//			Ingredient ketchup = new Ingredient("Ketchup", "condiment");
//			Ingredient curry = new Ingredient("Curry", "epice");
//			Ingredient cremefraiche = new Ingredient("Creme fraiche", "laitage");
//			Ingredient oignon = new Ingredient("Oignon", "legume");
//
//			// ajout de recettes
//			Recipe patoketchup = new Recipe("patoketchup","Des pates et du ketchup","mettre les pates, puis le ketchup", joseph,"SHAREDGROUP",
//					15,"facile");
//
//			Recipe patocurry = new Recipe("patocurry","Des pates et du curry","mettre les pates,puis la creme, puis le curry", quentin,"SHAREDGROUP",
//					20,"facile");
//
//			Recipe patalacremeoignon = new Recipe("patalacremeoignon","Des pates et des oignons","mettre les pates,puis la creme, puis les oignons", louis,"SHAREDGLOBAL",
//					30,"normale");
//
//			// creation des quantités dans les recettes associés
//			IngredientRecipe ingredientRecipe1 = new IngredientRecipe(pates,patoketchup,250);
//			IngredientRecipe ingredientRecipe2 = new IngredientRecipe(ketchup,patoketchup,28);
//			IngredientRecipe ingredientRecipe3 = new IngredientRecipe(pates,patocurry,200);
//			IngredientRecipe ingredientRecipe4 = new IngredientRecipe(curry,patocurry,12);
//			IngredientRecipe ingredientRecipe5 = new IngredientRecipe(cremefraiche,patocurry,150);
//			IngredientRecipe ingredientRecipe6 = new IngredientRecipe(pates,patalacremeoignon,150);
//			IngredientRecipe ingredientRecipe7 = new IngredientRecipe(cremefraiche,patalacremeoignon,100);
//			IngredientRecipe ingredientRecipe8 = new IngredientRecipe(oignon,patalacremeoignon,75);
//
//
//			// enregistrement des groupes
//			log.info("loading data " + groupRepo.save(groupe1));
//			log.info("loading data " + groupRepo.save(groupe2));
//
//			// enregistrement des users
//			log.info("loading data " + userRepo.save(louis));
//			log.info("loading data " + userRepo.save(quentin));
//			log.info("loading data " + userRepo.save(joseph));
//
//			// enregistrement des usergroup
//			log.info("loading data " + userGroupRepo.save(userGroup1));
//			log.info("loading data " + userGroupRepo.save(userGroup2));
//			log.info("loading data " + userGroupRepo.save(userGroup3));
//			log.info("loading data " + userGroupRepo.save(userGroup4));
//
//			// enregistrement des ingredients
//			log.info("loading data " + ingredientRepo.save(cremefraiche));
//			log.info("loading data " + ingredientRepo.save(curry));
//			log.info("loading data " + ingredientRepo.save(ketchup));
//			log.info("loading data " + ingredientRepo.save(oignon));
//			log.info("loading data " + ingredientRepo.save(pates));
//			log.info("loading data " + ingredientRepo.save(poulet));
//
//			// enregistrement des recettes
//			log.info("loading data " + recipeRepo.save(patalacremeoignon));
//			log.info("loading data " + recipeRepo.save(patocurry));
//			log.info("loading data " + recipeRepo.save(patoketchup));
//
//			// enregistrement des ingredientsrecipe
//			log.info("loading data " + ingredientRecipeRepo.save(ingredientRecipe1));
//			log.info("loading data " + ingredientRecipeRepo.save(ingredientRecipe2));
//			log.info("loading data " + ingredientRecipeRepo.save(ingredientRecipe3));
//			log.info("loading data " + ingredientRecipeRepo.save(ingredientRecipe4));
//			log.info("loading data " + ingredientRecipeRepo.save(ingredientRecipe5));
//			log.info("loading data " + ingredientRecipeRepo.save(ingredientRecipe6));
//			log.info("loading data " + ingredientRecipeRepo.save(ingredientRecipe7));
//			log.info("loading data " + ingredientRecipeRepo.save(ingredientRecipe8));
//
//		};
//	}
//}
