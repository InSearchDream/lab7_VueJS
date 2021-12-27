import Vue from "vue";
import Router from "vue-router";

Vue.use(Router);

const router = new Router({
    mode: 'history',
    routes: [
        {
            path: "/",
            name: "Trainers",
            component: () => import("./components/Trainers"),
        },
		{
            path: "/trainers",
            name: "Trainers",
            component: () => import("./components/Trainers"),
        },
        {
            path: "/trainer/addTrainer",
            name: "Trainer",
            component: () => import("./components/Trainer"),
        },
    ]
});

export default router;