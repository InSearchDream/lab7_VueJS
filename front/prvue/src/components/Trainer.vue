<template>
  <div>
    <h3>Добавление записи в таблицу Trainer</h3>
    <div class="container">
      <form @submit="validateAndSubmit">
        <fieldset class="form-group">
          <label>ФИО </label>
          <input type="text" class="form-control" v-model="fio" />
        </fieldset>
        <fieldset class="form-group">
          <label>Телефон </label>
          <input type="text" class="form-control" v-model="phone" />
        </fieldset>
        <fieldset class="form-group">
          <label>Дата рождения </label>
          <input type="text" class="form-control" v-model="birthday" />
        </fieldset>
        <button class="btn" type="submit" v-on:click="saveTrainer()">Сохранить</button>
      </form>
    </div>
  </div>
</template>
<script>

import TrainerDataService from "../service/TrainerDataService";

export default {
  name: "Trainer",
  data() {
    return {
      fio: "",
      phone: "",
      birthday: "",
      errors: [],
    };
  },
  methods: {
    saveTrainer() {
	 TrainerDataService.createTrainer({
        fio: this.fio,
        phone: this.phone,
        birthday: this.birthday,
     })
    this.$router.push("/trainers");          
    },
  },
};

</script>
