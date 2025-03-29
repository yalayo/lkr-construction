# provider config
terraform {
  cloud {
    organization = "rondon-sarnik"

    workspaces {
      name = "lkr-app"
    }
  }

  required_providers {
    cloudflare = {
      source  = "cloudflare/cloudflare"
      version = "~> 4.45.0"
    }
  }
}

variable "cloudflare_api_token" {
  default = ""
}

variable "cloudflare_account_id" {
  default = ""
}

variable "google_application_credentials" {
  default = ""
}

provider "cloudflare" {
  api_token = var.cloudflare_api_token
}

resource "cloudflare_workers_script" "score_backend" {
  account_id = var.cloudflare_account_id
  name       = "lkr-app"
  compatibility_date = "2024-01-01"
  module     = true
  content    = file("main.js")
}